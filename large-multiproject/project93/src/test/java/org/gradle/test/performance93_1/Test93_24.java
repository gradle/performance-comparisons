package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_24 {
    private final Production93_24 production = new Production93_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}