package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_418 {
    private final Production47_418 production = new Production47_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}