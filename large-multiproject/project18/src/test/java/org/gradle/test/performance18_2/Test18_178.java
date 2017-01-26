package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_178 {
    private final Production18_178 production = new Production18_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}