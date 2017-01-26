package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_257 {
    private final Production83_257 production = new Production83_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}