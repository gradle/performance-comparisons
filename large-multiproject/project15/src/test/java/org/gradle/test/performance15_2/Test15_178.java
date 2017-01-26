package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_178 {
    private final Production15_178 production = new Production15_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}