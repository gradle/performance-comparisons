package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_432 {
    private final Production83_432 production = new Production83_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}