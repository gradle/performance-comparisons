package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_493 {
    private final Production27_493 production = new Production27_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}