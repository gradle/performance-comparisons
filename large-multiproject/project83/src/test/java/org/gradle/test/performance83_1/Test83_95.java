package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_95 {
    private final Production83_95 production = new Production83_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}