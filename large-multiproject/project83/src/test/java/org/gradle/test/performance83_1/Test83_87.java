package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_87 {
    private final Production83_87 production = new Production83_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}