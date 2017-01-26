package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_233 {
    private final Production50_233 production = new Production50_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}