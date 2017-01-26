package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_150 {
    private final Production83_150 production = new Production83_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}