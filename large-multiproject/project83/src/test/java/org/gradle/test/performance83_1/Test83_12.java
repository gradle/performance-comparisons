package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_12 {
    private final Production83_12 production = new Production83_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}