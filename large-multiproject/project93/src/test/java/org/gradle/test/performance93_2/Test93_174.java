package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_174 {
    private final Production93_174 production = new Production93_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}