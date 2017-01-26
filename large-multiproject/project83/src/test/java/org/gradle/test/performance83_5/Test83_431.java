package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_431 {
    private final Production83_431 production = new Production83_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}