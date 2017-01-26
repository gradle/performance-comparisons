package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_8 {
    private final Production47_8 production = new Production47_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}