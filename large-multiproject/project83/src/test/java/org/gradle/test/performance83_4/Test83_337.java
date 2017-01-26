package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_337 {
    private final Production83_337 production = new Production83_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}