package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_59 {
    private final Production21_59 production = new Production21_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}