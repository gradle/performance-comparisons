package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_424 {
    private final Production21_424 production = new Production21_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}