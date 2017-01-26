package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_61 {
    private final Production83_61 production = new Production83_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}