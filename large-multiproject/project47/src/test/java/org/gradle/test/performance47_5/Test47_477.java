package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_477 {
    private final Production47_477 production = new Production47_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}