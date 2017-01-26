package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_28 {
    private final Production83_28 production = new Production83_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}