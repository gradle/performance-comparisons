package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_324 {
    private final Production83_324 production = new Production83_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}