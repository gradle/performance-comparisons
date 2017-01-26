package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_480 {
    private final Production84_480 production = new Production84_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}