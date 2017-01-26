package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_442 {
    private final Production83_442 production = new Production83_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}