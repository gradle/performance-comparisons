package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_12 {
    private final Production35_12 production = new Production35_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}