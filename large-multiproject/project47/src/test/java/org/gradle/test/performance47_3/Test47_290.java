package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_290 {
    private final Production47_290 production = new Production47_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}