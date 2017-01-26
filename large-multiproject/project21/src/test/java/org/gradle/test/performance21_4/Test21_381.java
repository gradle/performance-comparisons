package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_381 {
    private final Production21_381 production = new Production21_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}