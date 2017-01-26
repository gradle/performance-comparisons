package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_462 {
    private final Production83_462 production = new Production83_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}