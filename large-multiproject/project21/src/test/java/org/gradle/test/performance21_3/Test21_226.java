package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_226 {
    private final Production21_226 production = new Production21_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}