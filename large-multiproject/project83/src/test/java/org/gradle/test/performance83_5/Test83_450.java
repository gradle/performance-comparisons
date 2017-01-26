package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_450 {
    private final Production83_450 production = new Production83_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}