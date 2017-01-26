package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_12 {
    private final Production58_12 production = new Production58_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}