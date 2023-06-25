
package com.jbeans.Java8Features.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/quizze"})
public class Quizze {
    public Quizze() {
    }

    @GetMapping({"/nocharAccurance"})
    public Map<String, Long> findNoAccurance(@RequestParam String input) {
        String[] raw = input.split("");
        Map<String, Long> charAcc = (Map)Arrays.stream(raw).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charAcc;
    }

    @GetMapping({"/fibonacci"})
    public void fibonacci(@RequestParam String input) {
        Stream.iterate(new int[]{0, 1}, (arr) -> {
            return new int[]{arr[1], arr[0] + arr[1]};
        }).limit(Long.parseLong(input)).forEach((x) -> {
            System.out.println(" " + x[0] + " " + x[1]);
        });
    }
}
