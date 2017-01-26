package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_174 {
    private final Production84_174 production = new Production84_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}