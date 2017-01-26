package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_56 {
    private final Production83_56 production = new Production83_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}