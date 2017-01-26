package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_84 {
    private final Production35_84 production = new Production35_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}