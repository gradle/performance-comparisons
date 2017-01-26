package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_478 {
    private final Production84_478 production = new Production84_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}