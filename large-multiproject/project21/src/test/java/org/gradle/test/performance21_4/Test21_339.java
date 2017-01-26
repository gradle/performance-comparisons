package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_339 {
    private final Production21_339 production = new Production21_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}