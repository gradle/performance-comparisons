package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_451 {
    private final Production93_451 production = new Production93_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}