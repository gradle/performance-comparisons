package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_335 {
    private final Production27_335 production = new Production27_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}