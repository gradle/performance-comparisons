package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_242 {
    private final Production58_242 production = new Production58_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}