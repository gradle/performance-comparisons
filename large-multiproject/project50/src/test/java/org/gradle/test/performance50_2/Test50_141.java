package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_141 {
    private final Production50_141 production = new Production50_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}