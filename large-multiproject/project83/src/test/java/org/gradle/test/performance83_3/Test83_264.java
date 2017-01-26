package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_264 {
    private final Production83_264 production = new Production83_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}