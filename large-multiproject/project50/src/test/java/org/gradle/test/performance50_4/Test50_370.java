package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_370 {
    private final Production50_370 production = new Production50_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}