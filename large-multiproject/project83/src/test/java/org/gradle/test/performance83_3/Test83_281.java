package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_281 {
    private final Production83_281 production = new Production83_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}