package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_429 {
    private final Production93_429 production = new Production93_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}