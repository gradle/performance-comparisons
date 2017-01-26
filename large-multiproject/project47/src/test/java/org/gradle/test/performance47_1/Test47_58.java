package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_58 {
    private final Production47_58 production = new Production47_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}