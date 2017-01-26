package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_34 {
    private final Production47_34 production = new Production47_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}