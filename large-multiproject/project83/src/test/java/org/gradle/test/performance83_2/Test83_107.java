package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_107 {
    private final Production83_107 production = new Production83_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}