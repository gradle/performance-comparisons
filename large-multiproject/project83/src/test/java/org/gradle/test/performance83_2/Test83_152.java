package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_152 {
    private final Production83_152 production = new Production83_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}