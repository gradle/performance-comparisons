package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_55 {
    private final Production83_55 production = new Production83_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}