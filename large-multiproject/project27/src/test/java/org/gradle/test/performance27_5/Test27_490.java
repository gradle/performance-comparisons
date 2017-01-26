package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_490 {
    private final Production27_490 production = new Production27_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}