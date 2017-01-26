package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_361 {
    private final Production83_361 production = new Production83_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}