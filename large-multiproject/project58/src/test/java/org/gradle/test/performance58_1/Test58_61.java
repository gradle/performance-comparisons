package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_61 {
    private final Production58_61 production = new Production58_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}