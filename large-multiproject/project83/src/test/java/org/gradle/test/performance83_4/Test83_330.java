package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_330 {
    private final Production83_330 production = new Production83_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}