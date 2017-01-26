package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_365 {
    private final Production83_365 production = new Production83_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}