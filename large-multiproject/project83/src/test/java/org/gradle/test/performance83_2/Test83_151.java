package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_151 {
    private final Production83_151 production = new Production83_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}