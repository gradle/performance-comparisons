package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_305 {
    private final Production83_305 production = new Production83_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}