package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_392 {
    private final Production83_392 production = new Production83_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}