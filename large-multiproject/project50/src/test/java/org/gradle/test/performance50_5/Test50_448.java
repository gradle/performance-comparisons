package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_448 {
    private final Production50_448 production = new Production50_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}