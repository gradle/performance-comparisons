package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_329 {
    private final Production83_329 production = new Production83_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}