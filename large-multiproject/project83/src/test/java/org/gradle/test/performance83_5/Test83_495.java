package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_495 {
    private final Production83_495 production = new Production83_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}