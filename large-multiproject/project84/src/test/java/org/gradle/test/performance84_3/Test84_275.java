package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_275 {
    private final Production84_275 production = new Production84_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}