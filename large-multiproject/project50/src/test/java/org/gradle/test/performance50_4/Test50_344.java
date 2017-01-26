package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_344 {
    private final Production50_344 production = new Production50_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}