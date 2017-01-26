package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_196 {
    private final Production83_196 production = new Production83_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}