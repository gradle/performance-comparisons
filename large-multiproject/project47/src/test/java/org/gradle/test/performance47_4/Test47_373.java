package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_373 {
    private final Production47_373 production = new Production47_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}