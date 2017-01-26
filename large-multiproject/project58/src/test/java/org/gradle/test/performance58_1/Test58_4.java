package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_4 {
    private final Production58_4 production = new Production58_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}