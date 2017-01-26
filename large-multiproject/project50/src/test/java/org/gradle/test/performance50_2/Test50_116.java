package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_116 {
    private final Production50_116 production = new Production50_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}