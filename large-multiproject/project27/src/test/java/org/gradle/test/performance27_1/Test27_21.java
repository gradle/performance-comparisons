package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_21 {
    private final Production27_21 production = new Production27_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}