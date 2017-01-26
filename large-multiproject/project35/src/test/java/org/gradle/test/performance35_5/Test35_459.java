package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_459 {
    private final Production35_459 production = new Production35_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}