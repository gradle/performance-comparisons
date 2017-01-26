package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_105 {
    private final Production35_105 production = new Production35_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}