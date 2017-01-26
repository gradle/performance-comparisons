package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_321 {
    private final Production83_321 production = new Production83_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}