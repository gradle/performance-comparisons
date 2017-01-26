package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_448 {
    private final Production93_448 production = new Production93_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}