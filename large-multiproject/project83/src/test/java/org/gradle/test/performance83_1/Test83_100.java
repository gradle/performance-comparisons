package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_100 {
    private final Production83_100 production = new Production83_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}