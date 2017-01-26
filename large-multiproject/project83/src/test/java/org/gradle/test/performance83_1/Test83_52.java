package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_52 {
    private final Production83_52 production = new Production83_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}