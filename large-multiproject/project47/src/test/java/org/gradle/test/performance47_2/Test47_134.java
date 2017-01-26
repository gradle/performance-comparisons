package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_134 {
    private final Production47_134 production = new Production47_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}