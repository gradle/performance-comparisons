package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_308 {
    private final Production35_308 production = new Production35_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}