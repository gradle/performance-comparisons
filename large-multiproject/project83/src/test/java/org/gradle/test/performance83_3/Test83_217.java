package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_217 {
    private final Production83_217 production = new Production83_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}