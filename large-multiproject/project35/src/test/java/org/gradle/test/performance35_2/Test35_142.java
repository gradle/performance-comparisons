package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_142 {
    private final Production35_142 production = new Production35_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}