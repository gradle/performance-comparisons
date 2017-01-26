package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_37 {
    private final Production83_37 production = new Production83_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}