package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_266 {
    private final Production83_266 production = new Production83_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}