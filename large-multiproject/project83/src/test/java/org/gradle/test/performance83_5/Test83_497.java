package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_497 {
    private final Production83_497 production = new Production83_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}