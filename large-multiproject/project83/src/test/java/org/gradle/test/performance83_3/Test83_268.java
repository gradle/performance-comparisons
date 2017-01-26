package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_268 {
    private final Production83_268 production = new Production83_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}