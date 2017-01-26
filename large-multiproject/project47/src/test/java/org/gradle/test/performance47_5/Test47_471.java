package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_471 {
    private final Production47_471 production = new Production47_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}