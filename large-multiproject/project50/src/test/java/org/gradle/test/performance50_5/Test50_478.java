package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_478 {
    private final Production50_478 production = new Production50_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}