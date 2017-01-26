package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_30 {
    private final Production58_30 production = new Production58_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}