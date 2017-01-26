package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_79 {
    private final Production35_79 production = new Production35_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}