package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_178 {
    private final Production43_178 production = new Production43_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}