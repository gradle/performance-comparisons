package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_484 {
    private final Production47_484 production = new Production47_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}