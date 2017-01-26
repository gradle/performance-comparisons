package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_178 {
    private final Production24_178 production = new Production24_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}