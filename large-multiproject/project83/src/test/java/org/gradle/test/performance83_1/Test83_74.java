package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_74 {
    private final Production83_74 production = new Production83_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}