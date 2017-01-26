package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_270 {
    private final Production83_270 production = new Production83_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}