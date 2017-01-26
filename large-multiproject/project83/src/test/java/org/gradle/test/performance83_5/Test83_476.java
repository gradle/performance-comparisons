package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_476 {
    private final Production83_476 production = new Production83_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}