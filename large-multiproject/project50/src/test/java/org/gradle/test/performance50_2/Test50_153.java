package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_153 {
    private final Production50_153 production = new Production50_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}