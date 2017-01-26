package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_328 {
    private final Production50_328 production = new Production50_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}