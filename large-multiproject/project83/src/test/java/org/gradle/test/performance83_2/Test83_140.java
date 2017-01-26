package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_140 {
    private final Production83_140 production = new Production83_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}