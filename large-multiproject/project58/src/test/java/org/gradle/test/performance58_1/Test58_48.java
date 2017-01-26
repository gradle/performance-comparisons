package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_48 {
    private final Production58_48 production = new Production58_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}