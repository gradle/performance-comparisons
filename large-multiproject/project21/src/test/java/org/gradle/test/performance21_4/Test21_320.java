package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_320 {
    private final Production21_320 production = new Production21_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}