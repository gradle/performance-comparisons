package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_434 {
    private final Production47_434 production = new Production47_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}