package cz.wud.api.registrace;

import io.micronaut.context.annotation.Value;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author Filip
 */
@Singleton
public class RegistraceService {

  private final Path registracePath;

  @Inject
  public RegistraceService(@Value("${path.registrace}") Path registracePath) {
    this.registracePath = registracePath;
  }

  public void predRegistrace(PredRegistrace predRegistrace) throws IOException {
    Files.writeString(registracePath, String.format("%s\n", predRegistrace.getEmail()), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
  }
}
