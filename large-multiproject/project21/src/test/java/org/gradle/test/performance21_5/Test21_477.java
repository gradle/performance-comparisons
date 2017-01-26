package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_477 {
    private final Production21_477 production = new Production21_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}