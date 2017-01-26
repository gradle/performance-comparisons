package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_365 {
    private final Production35_365 production = new Production35_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}