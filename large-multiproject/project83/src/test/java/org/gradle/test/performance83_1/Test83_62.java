package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_62 {
    private final Production83_62 production = new Production83_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}