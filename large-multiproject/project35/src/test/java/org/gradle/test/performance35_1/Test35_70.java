package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_70 {
    private final Production35_70 production = new Production35_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}