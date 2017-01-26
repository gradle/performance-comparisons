package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_392 {
    private final Production47_392 production = new Production47_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}