// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/rules/modern/resources/proto/buildable_command.proto

package com.facebook.buck.rules.modern.model;

@javax.annotation.Generated(value="protoc", comments="annotations:BuildableCommandProto.java.pb.meta")
public final class BuildableCommandProto {
  private BuildableCommandProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_modern_v1_BuildableCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_modern_v1_BuildableCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_modern_v1_BuildableCommand_EnvEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_modern_v1_BuildableCommand_EnvEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJsrc/com/facebook/buck/rules/modern/res" +
      "ources/proto/buildable_command.proto\022\tmo" +
      "dern.v1\"\177\n\020BuildableCommand\022\014\n\004args\030\001 \003(" +
      "\t\0221\n\003env\030\002 \003(\0132$.modern.v1.BuildableComm" +
      "and.EnvEntry\032*\n\010EnvEntry\022\013\n\003key\030\001 \001(\t\022\r\n" +
      "\005value\030\002 \001(\t:\0028\001B?\n$com.facebook.buck.ru" +
      "les.modern.modelB\025BuildableCommandProtoP" +
      "\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_modern_v1_BuildableCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_modern_v1_BuildableCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_modern_v1_BuildableCommand_descriptor,
        new java.lang.String[] { "Args", "Env", });
    internal_static_modern_v1_BuildableCommand_EnvEntry_descriptor =
      internal_static_modern_v1_BuildableCommand_descriptor.getNestedTypes().get(0);
    internal_static_modern_v1_BuildableCommand_EnvEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_modern_v1_BuildableCommand_EnvEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}