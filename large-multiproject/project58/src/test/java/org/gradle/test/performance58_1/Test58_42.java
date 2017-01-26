package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_42 {
    private final Production58_42 production = new Production58_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}