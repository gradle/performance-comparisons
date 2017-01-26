package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_271 {
    private final Production50_271 production = new Production50_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}