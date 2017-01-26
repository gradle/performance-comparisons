package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_11 {
    private final Production50_11 production = new Production50_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}