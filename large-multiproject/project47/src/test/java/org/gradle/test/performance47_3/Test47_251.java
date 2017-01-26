package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_251 {
    private final Production47_251 production = new Production47_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}