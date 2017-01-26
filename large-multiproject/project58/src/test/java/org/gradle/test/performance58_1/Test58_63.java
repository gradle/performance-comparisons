package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_63 {
    private final Production58_63 production = new Production58_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}