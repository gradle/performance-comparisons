package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_265 {
    private final Production47_265 production = new Production47_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}