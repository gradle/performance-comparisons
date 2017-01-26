package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_127 {
    private final Production83_127 production = new Production83_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}