package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_134 {
    private final Production83_134 production = new Production83_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}