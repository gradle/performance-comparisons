package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_356 {
    private final Production83_356 production = new Production83_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}