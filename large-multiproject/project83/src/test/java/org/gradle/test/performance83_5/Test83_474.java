package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_474 {
    private final Production83_474 production = new Production83_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}