package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_81 {
    private final Production47_81 production = new Production47_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}