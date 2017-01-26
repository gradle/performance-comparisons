package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_243 {
    private final Production83_243 production = new Production83_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}