package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_54 {
    private final Production83_54 production = new Production83_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}