package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_8 {
    private final Production83_8 production = new Production83_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}