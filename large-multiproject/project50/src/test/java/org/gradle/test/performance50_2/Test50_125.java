package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_125 {
    private final Production50_125 production = new Production50_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}