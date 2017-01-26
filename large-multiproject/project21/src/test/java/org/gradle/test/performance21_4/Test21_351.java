package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_351 {
    private final Production21_351 production = new Production21_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}