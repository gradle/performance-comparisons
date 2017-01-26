package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_455 {
    private final Production93_455 production = new Production93_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}