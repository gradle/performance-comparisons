package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_7 {
    private final Production47_7 production = new Production47_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}