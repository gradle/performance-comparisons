package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_443 {
    private final Production27_443 production = new Production27_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}