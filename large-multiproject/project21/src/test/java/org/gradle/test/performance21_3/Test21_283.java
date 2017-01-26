package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_283 {
    private final Production21_283 production = new Production21_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}