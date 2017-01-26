package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_487 {
    private final Production50_487 production = new Production50_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}