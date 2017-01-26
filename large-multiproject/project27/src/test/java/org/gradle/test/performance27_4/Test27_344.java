package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_344 {
    private final Production27_344 production = new Production27_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}