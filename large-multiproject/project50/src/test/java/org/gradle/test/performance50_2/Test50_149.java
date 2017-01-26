package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_149 {
    private final Production50_149 production = new Production50_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}