package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_58 {
    private final Production83_58 production = new Production83_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}