package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_178 {
    private final Production7_178 production = new Production7_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}