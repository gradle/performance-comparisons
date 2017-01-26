package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_273 {
    private final Production27_273 production = new Production27_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}