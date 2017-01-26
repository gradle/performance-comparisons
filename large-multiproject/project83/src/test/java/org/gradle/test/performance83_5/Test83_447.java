package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_447 {
    private final Production83_447 production = new Production83_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}