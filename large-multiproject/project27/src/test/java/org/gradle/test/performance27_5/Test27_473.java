package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_473 {
    private final Production27_473 production = new Production27_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}