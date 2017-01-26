package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_201 {
    private final Production58_201 production = new Production58_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}