package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_5 {
    private final Production58_5 production = new Production58_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}