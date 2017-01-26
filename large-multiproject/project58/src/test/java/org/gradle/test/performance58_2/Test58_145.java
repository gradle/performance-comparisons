package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_145 {
    private final Production58_145 production = new Production58_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}