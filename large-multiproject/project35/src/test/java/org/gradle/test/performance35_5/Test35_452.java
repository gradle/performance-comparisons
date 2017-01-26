package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_452 {
    private final Production35_452 production = new Production35_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}