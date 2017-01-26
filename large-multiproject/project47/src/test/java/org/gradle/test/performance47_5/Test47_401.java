package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_401 {
    private final Production47_401 production = new Production47_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}