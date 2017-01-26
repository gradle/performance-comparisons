package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_114 {
    private final Production58_114 production = new Production58_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}