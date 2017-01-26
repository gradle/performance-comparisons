package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_275 {
    private final Production27_275 production = new Production27_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}