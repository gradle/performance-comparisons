package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_420 {
    private final Production93_420 production = new Production93_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}