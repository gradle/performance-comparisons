package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_493 {
    private final Production50_493 production = new Production50_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}