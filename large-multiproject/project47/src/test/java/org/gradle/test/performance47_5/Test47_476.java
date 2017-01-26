package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_476 {
    private final Production47_476 production = new Production47_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}