package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_450 {
    private final Production47_450 production = new Production47_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}