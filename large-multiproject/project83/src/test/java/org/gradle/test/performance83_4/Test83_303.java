package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_303 {
    private final Production83_303 production = new Production83_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}