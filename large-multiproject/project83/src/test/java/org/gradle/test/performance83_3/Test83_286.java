package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_286 {
    private final Production83_286 production = new Production83_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}