package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_2 {
    private final Production83_2 production = new Production83_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}