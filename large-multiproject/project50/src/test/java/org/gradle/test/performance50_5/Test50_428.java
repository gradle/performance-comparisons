package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_428 {
    private final Production50_428 production = new Production50_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}