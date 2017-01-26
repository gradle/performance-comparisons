package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_466 {
    private final Production83_466 production = new Production83_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}