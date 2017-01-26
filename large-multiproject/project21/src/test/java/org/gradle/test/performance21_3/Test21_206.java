package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_206 {
    private final Production21_206 production = new Production21_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}