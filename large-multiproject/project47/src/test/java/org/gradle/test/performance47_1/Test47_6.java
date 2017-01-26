package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_6 {
    private final Production47_6 production = new Production47_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}