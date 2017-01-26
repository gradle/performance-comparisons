package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_483 {
    private final Production27_483 production = new Production27_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}