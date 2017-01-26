package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_15 {
    private final Production83_15 production = new Production83_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}