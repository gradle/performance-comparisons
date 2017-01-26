package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_372 {
    private final Production4_372 production = new Production4_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}