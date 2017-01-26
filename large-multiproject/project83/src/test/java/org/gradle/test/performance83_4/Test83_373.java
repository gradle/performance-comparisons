package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_373 {
    private final Production83_373 production = new Production83_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}