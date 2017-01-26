package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_70 {
    private final Production58_70 production = new Production58_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}