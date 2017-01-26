package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_178 {
    private final Production14_178 production = new Production14_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}