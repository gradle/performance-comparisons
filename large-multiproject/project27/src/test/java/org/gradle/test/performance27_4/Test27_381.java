package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_381 {
    private final Production27_381 production = new Production27_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}