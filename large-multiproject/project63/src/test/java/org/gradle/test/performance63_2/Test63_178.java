package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_178 {
    private final Production63_178 production = new Production63_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}