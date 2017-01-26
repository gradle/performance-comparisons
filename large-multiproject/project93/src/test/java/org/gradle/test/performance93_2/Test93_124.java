package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_124 {
    private final Production93_124 production = new Production93_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}