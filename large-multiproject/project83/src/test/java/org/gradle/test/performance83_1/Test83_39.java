package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_39 {
    private final Production83_39 production = new Production83_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}