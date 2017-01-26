package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_229 {
    private final Production83_229 production = new Production83_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}