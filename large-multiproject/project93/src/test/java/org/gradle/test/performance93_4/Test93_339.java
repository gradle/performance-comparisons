package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_339 {
    private final Production93_339 production = new Production93_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}