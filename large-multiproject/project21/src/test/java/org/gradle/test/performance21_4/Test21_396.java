package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_396 {
    private final Production21_396 production = new Production21_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}