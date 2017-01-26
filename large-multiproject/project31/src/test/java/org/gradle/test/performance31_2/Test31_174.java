package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_174 {
    private final Production31_174 production = new Production31_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}