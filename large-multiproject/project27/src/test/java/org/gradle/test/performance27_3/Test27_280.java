package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_280 {
    private final Production27_280 production = new Production27_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}