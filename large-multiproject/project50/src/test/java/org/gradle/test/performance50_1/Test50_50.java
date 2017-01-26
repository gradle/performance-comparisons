package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_50 {
    private final Production50_50 production = new Production50_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}