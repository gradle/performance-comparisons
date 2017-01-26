package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_46 {
    private final Production83_46 production = new Production83_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}