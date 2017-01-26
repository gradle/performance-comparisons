package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_256 {
    private final Production50_256 production = new Production50_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}