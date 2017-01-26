package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_240 {
    private final Production93_240 production = new Production93_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}