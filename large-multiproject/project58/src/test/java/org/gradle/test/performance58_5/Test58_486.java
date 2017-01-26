package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_486 {
    private final Production58_486 production = new Production58_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}