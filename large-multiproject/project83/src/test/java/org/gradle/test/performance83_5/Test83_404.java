package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_404 {
    private final Production83_404 production = new Production83_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}