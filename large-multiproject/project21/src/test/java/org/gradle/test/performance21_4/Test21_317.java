package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_317 {
    private final Production21_317 production = new Production21_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}