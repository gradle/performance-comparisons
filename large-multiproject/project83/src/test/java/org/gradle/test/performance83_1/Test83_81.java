package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_81 {
    private final Production83_81 production = new Production83_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}