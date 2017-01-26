package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_376 {
    private final Production27_376 production = new Production27_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}