package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_138 {
    private final Production83_138 production = new Production83_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}