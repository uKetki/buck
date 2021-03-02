/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.buck.android;

import com.facebook.buck.android.apkmodule.APKModule;
import com.facebook.buck.android.apkmodule.APKModuleGraph;
import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.core.rules.BuildRuleResolver;
import com.facebook.buck.core.sourcepath.SourcePath;
import com.facebook.buck.io.filesystem.ProjectFilesystem;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

public class AndroidManifestFactory {

  public AndroidManifest createBuildRule(
      BuildTarget buildTarget,
      ProjectFilesystem projectFilesystem,
      BuildRuleResolver resolver,
      ImmutableSortedSet<BuildTarget> deps,
      SourcePath skeleton) {
    AndroidTransitiveDependencyGraph transitiveDependencyGraph =
        new AndroidTransitiveDependencyGraph(resolver.getAllRules(deps));
    ImmutableSet<SourcePath> manifestFiles = transitiveDependencyGraph.findManifestFiles();

    return new AndroidManifest(
        buildTarget,
        projectFilesystem,
        resolver,
        skeleton,
        APKModule.of(APKModuleGraph.ROOT_APKMODULE_NAME, true, true),
        manifestFiles);
  }
}
