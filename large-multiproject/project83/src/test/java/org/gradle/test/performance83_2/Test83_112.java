package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_112 {
    private final Production83_112 production = new Production83_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}