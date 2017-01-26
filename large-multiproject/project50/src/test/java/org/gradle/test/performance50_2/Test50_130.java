package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_130 {
    private final Production50_130 production = new Production50_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}