package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_224 {
    private final Production21_224 production = new Production21_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}