package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_210 {
    private final Production83_210 production = new Production83_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}