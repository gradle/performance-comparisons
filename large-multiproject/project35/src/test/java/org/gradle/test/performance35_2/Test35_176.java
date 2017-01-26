package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_176 {
    private final Production35_176 production = new Production35_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}