package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_15 {
    private final Production21_15 production = new Production21_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}