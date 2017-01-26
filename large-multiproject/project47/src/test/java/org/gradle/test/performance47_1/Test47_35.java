package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_35 {
    private final Production47_35 production = new Production47_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}