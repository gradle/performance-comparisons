package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_133 {
    private final Production93_133 production = new Production93_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}