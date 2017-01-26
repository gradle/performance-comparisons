package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_174 {
    private final Production83_174 production = new Production83_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}