package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_145 {
    private final Production35_145 production = new Production35_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}