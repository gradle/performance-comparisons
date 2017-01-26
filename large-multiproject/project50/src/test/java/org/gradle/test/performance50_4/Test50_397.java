package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_397 {
    private final Production50_397 production = new Production50_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}