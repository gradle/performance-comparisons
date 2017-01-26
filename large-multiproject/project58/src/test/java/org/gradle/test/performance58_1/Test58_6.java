package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_6 {
    private final Production58_6 production = new Production58_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}