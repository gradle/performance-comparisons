package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_46 {
    private final Production35_46 production = new Production35_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}