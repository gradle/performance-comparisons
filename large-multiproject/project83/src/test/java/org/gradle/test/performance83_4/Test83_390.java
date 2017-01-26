package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_390 {
    private final Production83_390 production = new Production83_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}