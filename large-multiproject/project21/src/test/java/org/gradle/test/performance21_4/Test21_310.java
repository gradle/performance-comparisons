package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_310 {
    private final Production21_310 production = new Production21_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}