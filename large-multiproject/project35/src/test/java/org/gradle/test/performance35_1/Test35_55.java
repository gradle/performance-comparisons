package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_55 {
    private final Production35_55 production = new Production35_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}