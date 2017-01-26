package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_499 {
    private final Production27_499 production = new Production27_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}