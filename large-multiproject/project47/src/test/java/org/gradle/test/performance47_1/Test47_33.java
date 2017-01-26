package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_33 {
    private final Production47_33 production = new Production47_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}