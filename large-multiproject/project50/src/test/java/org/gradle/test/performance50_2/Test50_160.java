package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_160 {
    private final Production50_160 production = new Production50_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}