package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_410 {
    private final Production93_410 production = new Production93_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}