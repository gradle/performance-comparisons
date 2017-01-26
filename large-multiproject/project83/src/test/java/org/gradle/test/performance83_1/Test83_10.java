package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_10 {
    private final Production83_10 production = new Production83_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}