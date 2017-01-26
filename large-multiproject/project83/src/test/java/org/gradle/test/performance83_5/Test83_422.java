package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_422 {
    private final Production83_422 production = new Production83_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}