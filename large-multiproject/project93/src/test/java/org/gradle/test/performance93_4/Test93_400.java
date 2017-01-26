package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_400 {
    private final Production93_400 production = new Production93_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}