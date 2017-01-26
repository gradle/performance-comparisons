package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_178 {
    private final Production89_178 production = new Production89_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}