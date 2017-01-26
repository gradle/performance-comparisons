package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_147 {
    private final Production83_147 production = new Production83_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}