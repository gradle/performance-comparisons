package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_316 {
    private final Production93_316 production = new Production93_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}