package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_178 {
    private final Production20_178 production = new Production20_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}