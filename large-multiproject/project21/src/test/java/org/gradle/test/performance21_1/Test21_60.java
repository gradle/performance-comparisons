package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_60 {
    private final Production21_60 production = new Production21_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}