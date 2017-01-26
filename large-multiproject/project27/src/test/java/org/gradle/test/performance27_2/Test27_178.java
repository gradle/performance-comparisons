package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_178 {
    private final Production27_178 production = new Production27_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}