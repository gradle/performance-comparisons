package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_236 {
    private final Production50_236 production = new Production50_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}