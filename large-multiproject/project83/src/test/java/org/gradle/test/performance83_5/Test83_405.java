package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_405 {
    private final Production83_405 production = new Production83_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}