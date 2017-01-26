package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_481 {
    private final Production47_481 production = new Production47_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}