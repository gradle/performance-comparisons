package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_405 {
    private final Production35_405 production = new Production35_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}