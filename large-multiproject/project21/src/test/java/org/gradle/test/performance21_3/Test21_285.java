package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_285 {
    private final Production21_285 production = new Production21_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}