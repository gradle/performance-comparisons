package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_434 {
    private final Production83_434 production = new Production83_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}