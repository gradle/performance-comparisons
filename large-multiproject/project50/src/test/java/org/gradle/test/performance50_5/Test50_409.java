package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_409 {
    private final Production50_409 production = new Production50_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}