package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_426 {
    private final Production83_426 production = new Production83_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}