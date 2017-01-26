package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_248 {
    private final Production27_248 production = new Production27_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}