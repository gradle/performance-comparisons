package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_162 {
    private final Production83_162 production = new Production83_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}