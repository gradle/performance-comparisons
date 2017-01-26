package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_468 {
    private final Production83_468 production = new Production83_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}