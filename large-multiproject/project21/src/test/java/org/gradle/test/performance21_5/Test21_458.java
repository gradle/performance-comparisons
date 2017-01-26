package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_458 {
    private final Production21_458 production = new Production21_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}