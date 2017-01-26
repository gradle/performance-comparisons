package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_130 {
    private final Production27_130 production = new Production27_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}