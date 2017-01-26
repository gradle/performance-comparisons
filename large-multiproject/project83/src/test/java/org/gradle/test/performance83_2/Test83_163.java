package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_163 {
    private final Production83_163 production = new Production83_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}