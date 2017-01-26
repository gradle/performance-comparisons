package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_153 {
    private final Production93_153 production = new Production93_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}