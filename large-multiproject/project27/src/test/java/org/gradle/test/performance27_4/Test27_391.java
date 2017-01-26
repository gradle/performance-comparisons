package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_391 {
    private final Production27_391 production = new Production27_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}