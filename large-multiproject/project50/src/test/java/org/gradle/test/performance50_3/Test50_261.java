package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_261 {
    private final Production50_261 production = new Production50_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}