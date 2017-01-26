package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_64 {
    private final Production35_64 production = new Production35_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}