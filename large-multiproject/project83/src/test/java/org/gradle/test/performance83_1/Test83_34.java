package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_34 {
    private final Production83_34 production = new Production83_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}