package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_313 {
    private final Production47_313 production = new Production47_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}