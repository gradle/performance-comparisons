package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_304 {
    private final Production47_304 production = new Production47_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}