package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_154 {
    private final Production83_154 production = new Production83_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}