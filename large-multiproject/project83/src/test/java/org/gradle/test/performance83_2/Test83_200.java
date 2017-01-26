package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_200 {
    private final Production83_200 production = new Production83_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}