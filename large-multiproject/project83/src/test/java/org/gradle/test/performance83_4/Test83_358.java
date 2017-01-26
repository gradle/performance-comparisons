package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_358 {
    private final Production83_358 production = new Production83_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}