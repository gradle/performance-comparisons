package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_483 {
    private final Production93_483 production = new Production93_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}