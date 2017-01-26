package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_262 {
    private final Production93_262 production = new Production93_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}