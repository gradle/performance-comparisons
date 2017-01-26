package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_360 {
    private final Production21_360 production = new Production21_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}