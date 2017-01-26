package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_89 {
    private final Production83_89 production = new Production83_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}