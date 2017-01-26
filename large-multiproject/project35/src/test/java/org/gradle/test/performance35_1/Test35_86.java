package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_86 {
    private final Production35_86 production = new Production35_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}