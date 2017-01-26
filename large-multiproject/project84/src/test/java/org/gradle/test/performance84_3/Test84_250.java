package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_250 {
    private final Production84_250 production = new Production84_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}