package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_185 {
    private final Production50_185 production = new Production50_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}