package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_299 {
    private final Production93_299 production = new Production93_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}