package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_114 {
    private final Production83_114 production = new Production83_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}