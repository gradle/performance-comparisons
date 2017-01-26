package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_256 {
    private final Production84_256 production = new Production84_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}