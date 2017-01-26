package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_483 {
    private final Production84_483 production = new Production84_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}