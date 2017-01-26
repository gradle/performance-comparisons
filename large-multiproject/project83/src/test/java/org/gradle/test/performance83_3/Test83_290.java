package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_290 {
    private final Production83_290 production = new Production83_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}