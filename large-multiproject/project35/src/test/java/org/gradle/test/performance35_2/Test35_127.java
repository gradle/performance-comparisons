package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_127 {
    private final Production35_127 production = new Production35_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}