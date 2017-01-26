package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_297 {
    private final Production47_297 production = new Production47_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}