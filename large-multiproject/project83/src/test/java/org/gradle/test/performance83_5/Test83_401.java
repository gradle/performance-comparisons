package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_401 {
    private final Production83_401 production = new Production83_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}