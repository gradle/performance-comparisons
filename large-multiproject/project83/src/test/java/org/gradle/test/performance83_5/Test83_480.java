package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_480 {
    private final Production83_480 production = new Production83_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}