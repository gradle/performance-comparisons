package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_372 {
    private final Production58_372 production = new Production58_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}