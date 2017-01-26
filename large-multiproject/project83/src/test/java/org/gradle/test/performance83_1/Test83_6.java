package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_6 {
    private final Production83_6 production = new Production83_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}