package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_276 {
    private final Production93_276 production = new Production93_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}