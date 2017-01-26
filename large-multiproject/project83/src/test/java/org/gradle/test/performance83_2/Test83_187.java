package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_187 {
    private final Production83_187 production = new Production83_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}