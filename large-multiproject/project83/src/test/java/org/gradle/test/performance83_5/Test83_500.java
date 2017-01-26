package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_500 {
    private final Production83_500 production = new Production83_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}