package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_245 {
    private final Production50_245 production = new Production50_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}