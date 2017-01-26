package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_30 {
    private final Production35_30 production = new Production35_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}