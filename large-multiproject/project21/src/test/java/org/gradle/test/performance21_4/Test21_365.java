package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_365 {
    private final Production21_365 production = new Production21_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}