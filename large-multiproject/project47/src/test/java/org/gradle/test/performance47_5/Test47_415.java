package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_415 {
    private final Production47_415 production = new Production47_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}