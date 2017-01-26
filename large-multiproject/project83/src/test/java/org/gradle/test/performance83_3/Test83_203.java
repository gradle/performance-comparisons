package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_203 {
    private final Production83_203 production = new Production83_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}