package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_126 {
    private final Production83_126 production = new Production83_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}