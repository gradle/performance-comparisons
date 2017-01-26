package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_7 {
    private final Production58_7 production = new Production58_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}