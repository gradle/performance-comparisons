package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_63 {
    private final Production83_63 production = new Production83_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}