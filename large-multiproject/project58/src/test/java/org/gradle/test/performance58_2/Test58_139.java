package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_139 {
    private final Production58_139 production = new Production58_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}