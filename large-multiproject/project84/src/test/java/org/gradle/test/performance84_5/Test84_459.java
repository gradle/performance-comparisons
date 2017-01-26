package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_459 {
    private final Production84_459 production = new Production84_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}