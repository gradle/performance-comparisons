package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_249 {
    private final Production83_249 production = new Production83_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}