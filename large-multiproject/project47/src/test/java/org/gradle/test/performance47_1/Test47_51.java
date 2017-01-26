package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_51 {
    private final Production47_51 production = new Production47_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}