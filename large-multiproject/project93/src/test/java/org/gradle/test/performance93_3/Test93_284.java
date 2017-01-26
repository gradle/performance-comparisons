package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_284 {
    private final Production93_284 production = new Production93_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}