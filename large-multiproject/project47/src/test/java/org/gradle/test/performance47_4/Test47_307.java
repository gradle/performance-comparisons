package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_307 {
    private final Production47_307 production = new Production47_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}