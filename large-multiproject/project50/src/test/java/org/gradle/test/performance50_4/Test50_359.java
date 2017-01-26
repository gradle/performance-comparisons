package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_359 {
    private final Production50_359 production = new Production50_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}