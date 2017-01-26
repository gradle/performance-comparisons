package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_186 {
    private final Production83_186 production = new Production83_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}