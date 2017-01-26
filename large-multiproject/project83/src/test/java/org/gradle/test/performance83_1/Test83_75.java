package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_75 {
    private final Production83_75 production = new Production83_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}