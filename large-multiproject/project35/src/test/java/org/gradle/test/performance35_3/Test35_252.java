package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_252 {
    private final Production35_252 production = new Production35_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}