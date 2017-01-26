package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_213 {
    private final Production21_213 production = new Production21_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}