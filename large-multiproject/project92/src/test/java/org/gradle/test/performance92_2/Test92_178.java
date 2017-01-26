package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_178 {
    private final Production92_178 production = new Production92_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}