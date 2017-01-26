package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_485 {
    private final Production83_485 production = new Production83_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}