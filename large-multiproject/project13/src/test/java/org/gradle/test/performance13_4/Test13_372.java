package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_372 {
    private final Production13_372 production = new Production13_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}