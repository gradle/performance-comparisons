package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_29 {
    private final Production83_29 production = new Production83_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}