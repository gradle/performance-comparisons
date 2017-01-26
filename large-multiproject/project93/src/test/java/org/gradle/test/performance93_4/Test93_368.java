package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_368 {
    private final Production93_368 production = new Production93_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}