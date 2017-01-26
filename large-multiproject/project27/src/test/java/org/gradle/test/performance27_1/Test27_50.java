package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_50 {
    private final Production27_50 production = new Production27_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}