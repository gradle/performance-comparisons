package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_139 {
    private final Production83_139 production = new Production83_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}