package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_173 {
    private final Production47_173 production = new Production47_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}