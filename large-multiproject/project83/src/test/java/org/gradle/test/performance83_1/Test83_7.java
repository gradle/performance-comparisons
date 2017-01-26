package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_7 {
    private final Production83_7 production = new Production83_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}