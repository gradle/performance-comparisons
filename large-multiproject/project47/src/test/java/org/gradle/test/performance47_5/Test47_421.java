package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_421 {
    private final Production47_421 production = new Production47_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}