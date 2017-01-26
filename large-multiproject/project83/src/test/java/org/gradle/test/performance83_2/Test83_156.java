package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_156 {
    private final Production83_156 production = new Production83_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}