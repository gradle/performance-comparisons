package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_289 {
    private final Production83_289 production = new Production83_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}