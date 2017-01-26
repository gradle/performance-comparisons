package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_161 {
    private final Production83_161 production = new Production83_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}