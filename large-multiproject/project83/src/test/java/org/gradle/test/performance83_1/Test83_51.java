package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_51 {
    private final Production83_51 production = new Production83_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}