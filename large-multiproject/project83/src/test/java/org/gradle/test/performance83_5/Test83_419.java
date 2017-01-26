package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_419 {
    private final Production83_419 production = new Production83_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}