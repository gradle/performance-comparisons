package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_471 {
    private final Production83_471 production = new Production83_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}