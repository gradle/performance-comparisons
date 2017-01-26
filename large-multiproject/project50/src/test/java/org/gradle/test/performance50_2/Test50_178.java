package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_178 {
    private final Production50_178 production = new Production50_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}