package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_333 {
    private final Production27_333 production = new Production27_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}