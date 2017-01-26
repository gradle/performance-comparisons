package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_212 {
    private final Production83_212 production = new Production83_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}