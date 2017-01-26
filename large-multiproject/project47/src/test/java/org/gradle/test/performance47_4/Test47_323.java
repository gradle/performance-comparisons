package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_323 {
    private final Production47_323 production = new Production47_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}