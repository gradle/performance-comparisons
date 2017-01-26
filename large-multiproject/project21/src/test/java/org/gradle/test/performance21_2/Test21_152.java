package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_152 {
    private final Production21_152 production = new Production21_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}