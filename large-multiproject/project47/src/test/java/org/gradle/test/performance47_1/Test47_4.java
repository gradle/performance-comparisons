package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_4 {
    private final Production47_4 production = new Production47_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}