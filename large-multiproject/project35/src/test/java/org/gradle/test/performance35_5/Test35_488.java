package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_488 {
    private final Production35_488 production = new Production35_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}