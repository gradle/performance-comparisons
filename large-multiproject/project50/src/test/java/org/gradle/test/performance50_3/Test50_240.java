package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_240 {
    private final Production50_240 production = new Production50_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}