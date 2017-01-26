package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_175 {
    private final Production58_175 production = new Production58_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}