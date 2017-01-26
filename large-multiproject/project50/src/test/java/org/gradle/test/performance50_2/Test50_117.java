package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_117 {
    private final Production50_117 production = new Production50_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}