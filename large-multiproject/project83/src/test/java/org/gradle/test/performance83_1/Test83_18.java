package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_18 {
    private final Production83_18 production = new Production83_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}