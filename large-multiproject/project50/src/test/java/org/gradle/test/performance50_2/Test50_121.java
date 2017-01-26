package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_121 {
    private final Production50_121 production = new Production50_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}