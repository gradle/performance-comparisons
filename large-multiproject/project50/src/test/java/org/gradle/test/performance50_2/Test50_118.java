package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_118 {
    private final Production50_118 production = new Production50_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}