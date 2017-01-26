package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_174 {
    private final Production35_174 production = new Production35_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}