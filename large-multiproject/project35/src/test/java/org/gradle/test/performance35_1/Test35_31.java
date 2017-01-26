package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_31 {
    private final Production35_31 production = new Production35_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}