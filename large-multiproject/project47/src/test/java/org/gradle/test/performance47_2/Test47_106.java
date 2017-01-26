package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_106 {
    private final Production47_106 production = new Production47_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}