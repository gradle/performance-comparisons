package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_246 {
    private final Production83_246 production = new Production83_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}