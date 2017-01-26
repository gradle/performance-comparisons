package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_258 {
    private final Production27_258 production = new Production27_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}