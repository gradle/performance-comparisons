package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_490 {
    private final Production93_490 production = new Production93_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}