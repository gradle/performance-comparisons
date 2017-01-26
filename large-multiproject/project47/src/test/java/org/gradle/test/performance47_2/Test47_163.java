package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_163 {
    private final Production47_163 production = new Production47_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}