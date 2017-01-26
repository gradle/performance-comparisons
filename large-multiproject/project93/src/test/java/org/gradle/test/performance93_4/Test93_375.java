package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_375 {
    private final Production93_375 production = new Production93_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}