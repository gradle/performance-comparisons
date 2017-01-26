package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_349 {
    private final Production93_349 production = new Production93_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}