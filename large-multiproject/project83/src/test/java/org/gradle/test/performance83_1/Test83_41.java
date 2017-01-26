package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_41 {
    private final Production83_41 production = new Production83_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}