package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_329 {
    private final Production21_329 production = new Production21_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}