package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_178 {
    private final Production30_178 production = new Production30_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}