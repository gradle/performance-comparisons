package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_137 {
    private final Production83_137 production = new Production83_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}