package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_441 {
    private final Production35_441 production = new Production35_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}