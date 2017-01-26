package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_11 {
    private final Production93_11 production = new Production93_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}