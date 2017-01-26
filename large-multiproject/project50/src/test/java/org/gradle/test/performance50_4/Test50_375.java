package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_375 {
    private final Production50_375 production = new Production50_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}