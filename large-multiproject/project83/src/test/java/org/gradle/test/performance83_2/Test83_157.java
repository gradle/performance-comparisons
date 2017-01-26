package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_157 {
    private final Production83_157 production = new Production83_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}