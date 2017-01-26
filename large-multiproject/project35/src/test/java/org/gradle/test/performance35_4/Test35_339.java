package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_339 {
    private final Production35_339 production = new Production35_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}