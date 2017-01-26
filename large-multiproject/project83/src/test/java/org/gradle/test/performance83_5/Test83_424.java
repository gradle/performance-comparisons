package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_424 {
    private final Production83_424 production = new Production83_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}