package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_443 {
    private final Production93_443 production = new Production93_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}