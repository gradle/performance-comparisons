package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_50 {
    private final Production93_50 production = new Production93_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}