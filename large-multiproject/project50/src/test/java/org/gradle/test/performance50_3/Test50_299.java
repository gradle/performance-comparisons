package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_299 {
    private final Production50_299 production = new Production50_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}