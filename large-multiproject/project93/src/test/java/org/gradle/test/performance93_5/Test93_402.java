package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_402 {
    private final Production93_402 production = new Production93_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}