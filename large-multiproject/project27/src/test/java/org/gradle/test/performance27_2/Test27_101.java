package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_101 {
    private final Production27_101 production = new Production27_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}