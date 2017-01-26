package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_308 {
    private final Production50_308 production = new Production50_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}