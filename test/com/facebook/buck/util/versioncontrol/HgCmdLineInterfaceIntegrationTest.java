import java.nio.charset.StandardCharsets;
      InputStreamReader diffFileReader =
          new InputStreamReader(diffFileStream, StandardCharsets.UTF_8);
    List<String> lines = Files.readLines(bookmarksFile.toFile(), StandardCharsets.UTF_8);