package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_18 {
    private final Production58_18 production = new Production58_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}