package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_191 {
    private final Production83_191 production = new Production83_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}