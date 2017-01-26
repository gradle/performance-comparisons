package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_302 {
    private final Production83_302 production = new Production83_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}