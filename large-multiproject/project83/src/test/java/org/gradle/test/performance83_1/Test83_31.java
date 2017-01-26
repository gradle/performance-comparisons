package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_31 {
    private final Production83_31 production = new Production83_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}