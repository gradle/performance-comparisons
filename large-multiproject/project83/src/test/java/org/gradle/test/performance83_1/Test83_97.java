package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_97 {
    private final Production83_97 production = new Production83_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}