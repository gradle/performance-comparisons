package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_372 {
    private final Production31_372 production = new Production31_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}