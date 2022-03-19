package com.app.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/names")
    public List<String> names()  {
        List.of("Atlanta", "Dallas", "New York");
        return Arrays.asList("Abebe", "Kebede", "Beyene");
    }

    @GetMapping("/factor/{n}")
    public List<Integer> findFactors(@PathVariable int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }

        }
        return factors;

    }

    @GetMapping("/primes/{n}")
    public List<Integer> findPrimesTillN(@PathVariable int n) {
        int[] primes = {};
        List<Integer> primesList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primesList.add(i);
            }
        }
        return primesList;
    }

    private boolean isPrime(int n) {
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter <= 1;
    }

    @GetMapping("/cities")
    public List<String> cities()  {
        return List.of("Atlanta", "Dallas", "New York");
    }


}
