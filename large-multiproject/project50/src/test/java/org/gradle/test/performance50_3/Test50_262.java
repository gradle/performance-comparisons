package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_262 {
    private final Production50_262 production = new Production50_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}