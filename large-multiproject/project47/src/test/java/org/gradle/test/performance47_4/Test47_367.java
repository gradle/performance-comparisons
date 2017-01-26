package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_367 {
    private final Production47_367 production = new Production47_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}