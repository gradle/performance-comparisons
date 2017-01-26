package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_265 {
    private final Production83_265 production = new Production83_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}