package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_178 {
    private final Production73_178 production = new Production73_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}