package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_22 {
    private final Production50_22 production = new Production50_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}