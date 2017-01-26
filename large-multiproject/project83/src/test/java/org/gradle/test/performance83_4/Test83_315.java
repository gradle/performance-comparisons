package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_315 {
    private final Production83_315 production = new Production83_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}