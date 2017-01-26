package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_174 {
    private final Production4_174 production = new Production4_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}