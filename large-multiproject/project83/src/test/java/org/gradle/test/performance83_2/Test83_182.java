package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_182 {
    private final Production83_182 production = new Production83_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}