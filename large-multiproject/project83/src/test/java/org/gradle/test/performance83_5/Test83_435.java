package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_435 {
    private final Production83_435 production = new Production83_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}