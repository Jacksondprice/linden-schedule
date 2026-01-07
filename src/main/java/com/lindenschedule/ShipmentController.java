package com.lindenschedule;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
