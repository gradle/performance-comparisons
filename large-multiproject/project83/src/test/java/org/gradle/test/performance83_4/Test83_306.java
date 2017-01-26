package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_306 {
    private final Production83_306 production = new Production83_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}