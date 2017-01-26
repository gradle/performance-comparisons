package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_67 {
    private final Production83_67 production = new Production83_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}