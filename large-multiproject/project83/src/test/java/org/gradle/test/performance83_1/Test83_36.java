package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_36 {
    private final Production83_36 production = new Production83_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}