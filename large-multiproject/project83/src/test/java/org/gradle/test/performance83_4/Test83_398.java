package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_398 {
    private final Production83_398 production = new Production83_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}