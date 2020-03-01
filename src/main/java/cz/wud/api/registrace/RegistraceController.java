package cz.wud.api.registrace;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;

import javax.inject.Inject;
import java.io.IOException;

/**
 * @author Filip
 */
@Controller
public class RegistraceController {
  private final RegistraceService service;

  @Inject
  public RegistraceController(RegistraceService service) {
    this.service = service;
  }

  @Post("/pred-registrace")
  @Status(HttpStatus.CREATED)
  public void predRegistrace(PredRegistrace predRegistrace) throws IOException {
    service.predRegistrace(predRegistrace);
  }
}
