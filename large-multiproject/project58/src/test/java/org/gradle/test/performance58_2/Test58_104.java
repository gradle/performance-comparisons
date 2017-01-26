package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_104 {
    private final Production58_104 production = new Production58_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}