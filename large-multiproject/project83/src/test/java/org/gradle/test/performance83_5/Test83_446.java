package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_446 {
    private final Production83_446 production = new Production83_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}