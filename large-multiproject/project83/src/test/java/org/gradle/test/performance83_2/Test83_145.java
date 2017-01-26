package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_145 {
    private final Production83_145 production = new Production83_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}