package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_59 {
    private final Production83_59 production = new Production83_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}