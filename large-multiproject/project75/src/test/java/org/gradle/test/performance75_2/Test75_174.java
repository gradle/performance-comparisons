package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_174 {
    private final Production75_174 production = new Production75_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}