package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_180 {
    private final Production35_180 production = new Production35_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}