package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_372 {
    private final Production92_372 production = new Production92_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}