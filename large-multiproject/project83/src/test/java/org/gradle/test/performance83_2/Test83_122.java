package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_122 {
    private final Production83_122 production = new Production83_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}