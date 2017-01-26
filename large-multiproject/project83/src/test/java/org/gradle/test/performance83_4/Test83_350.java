package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_350 {
    private final Production83_350 production = new Production83_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}