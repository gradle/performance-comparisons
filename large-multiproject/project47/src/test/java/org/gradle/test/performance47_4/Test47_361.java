package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_361 {
    private final Production47_361 production = new Production47_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}