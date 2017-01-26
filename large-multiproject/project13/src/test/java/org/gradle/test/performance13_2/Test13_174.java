package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_174 {
    private final Production13_174 production = new Production13_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}