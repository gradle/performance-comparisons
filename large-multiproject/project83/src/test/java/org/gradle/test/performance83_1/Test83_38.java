package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_38 {
    private final Production83_38 production = new Production83_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}