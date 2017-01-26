package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_143 {
    private final Production83_143 production = new Production83_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}