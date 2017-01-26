package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_304 {
    private final Production21_304 production = new Production21_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}