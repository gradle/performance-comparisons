package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_372 {
    private final Production84_372 production = new Production84_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}