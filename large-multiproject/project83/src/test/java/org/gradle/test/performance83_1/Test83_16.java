package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_16 {
    private final Production83_16 production = new Production83_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}