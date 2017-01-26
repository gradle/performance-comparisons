package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_215 {
    private final Production83_215 production = new Production83_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}