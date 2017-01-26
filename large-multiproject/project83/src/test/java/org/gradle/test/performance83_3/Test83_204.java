package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_204 {
    private final Production83_204 production = new Production83_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}