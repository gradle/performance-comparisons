package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_155 {
    private final Production83_155 production = new Production83_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}