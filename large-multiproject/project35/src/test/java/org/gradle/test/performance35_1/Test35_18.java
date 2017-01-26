package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_18 {
    private final Production35_18 production = new Production35_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}