package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_133 {
    private final Production58_133 production = new Production58_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}