package io.zghurskyi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateGreetingRequest {
    private String name;
    private String greeting;
}
