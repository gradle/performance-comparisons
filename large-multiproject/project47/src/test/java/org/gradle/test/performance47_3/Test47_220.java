package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_220 {
    private final Production47_220 production = new Production47_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}