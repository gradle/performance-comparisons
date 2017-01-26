package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_175 {
    private final Production83_175 production = new Production83_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}