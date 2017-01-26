package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_178 {
    private final Production72_178 production = new Production72_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}