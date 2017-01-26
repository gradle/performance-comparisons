package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_403 {
    private final Production83_403 production = new Production83_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}