package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_57 {
    private final Production83_57 production = new Production83_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}