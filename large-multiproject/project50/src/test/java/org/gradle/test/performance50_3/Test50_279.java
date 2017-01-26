package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_279 {
    private final Production50_279 production = new Production50_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}