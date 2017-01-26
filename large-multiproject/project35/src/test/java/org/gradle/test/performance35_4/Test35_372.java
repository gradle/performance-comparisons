package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_372 {
    private final Production35_372 production = new Production35_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}