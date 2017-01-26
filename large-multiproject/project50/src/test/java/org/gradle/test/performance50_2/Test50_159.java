package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_159 {
    private final Production50_159 production = new Production50_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}