package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_453 {
    private final Production27_453 production = new Production27_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}