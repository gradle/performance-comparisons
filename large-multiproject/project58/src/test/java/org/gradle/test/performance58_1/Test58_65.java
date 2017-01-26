package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_65 {
    private final Production58_65 production = new Production58_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}