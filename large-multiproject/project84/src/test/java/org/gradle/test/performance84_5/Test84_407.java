package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_407 {
    private final Production84_407 production = new Production84_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}