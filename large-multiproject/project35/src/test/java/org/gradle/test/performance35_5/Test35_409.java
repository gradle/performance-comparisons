package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_409 {
    private final Production35_409 production = new Production35_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}