package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_177 {
    private final Production50_177 production = new Production50_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}