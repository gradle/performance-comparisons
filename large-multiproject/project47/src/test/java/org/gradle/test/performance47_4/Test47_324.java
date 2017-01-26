package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_324 {
    private final Production47_324 production = new Production47_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}