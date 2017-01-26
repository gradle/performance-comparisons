package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_317 {
    private final Production47_317 production = new Production47_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}