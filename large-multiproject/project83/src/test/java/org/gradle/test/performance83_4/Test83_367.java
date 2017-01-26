package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_367 {
    private final Production83_367 production = new Production83_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}