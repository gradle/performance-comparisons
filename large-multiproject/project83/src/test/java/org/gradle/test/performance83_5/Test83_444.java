package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_444 {
    private final Production83_444 production = new Production83_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}