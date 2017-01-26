package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_132 {
    private final Production50_132 production = new Production50_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}