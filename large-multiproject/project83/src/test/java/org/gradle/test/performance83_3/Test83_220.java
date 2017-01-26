package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_220 {
    private final Production83_220 production = new Production83_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}