package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_82 {
    private final Production83_82 production = new Production83_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}