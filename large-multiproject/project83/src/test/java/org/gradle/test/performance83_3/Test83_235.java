package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_235 {
    private final Production83_235 production = new Production83_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}