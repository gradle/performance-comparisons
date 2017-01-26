package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_414 {
    private final Production84_414 production = new Production84_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}