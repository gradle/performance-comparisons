package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_178 {
    private final Production49_178 production = new Production49_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}