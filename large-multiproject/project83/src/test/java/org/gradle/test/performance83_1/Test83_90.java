package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_90 {
    private final Production83_90 production = new Production83_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}