package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_260 {
    private final Production47_260 production = new Production47_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}