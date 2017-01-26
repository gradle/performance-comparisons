package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_174 {
    private final Production58_174 production = new Production58_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}