package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_343 {
    private final Production21_343 production = new Production21_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}