package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_243 {
    private final Production21_243 production = new Production21_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}