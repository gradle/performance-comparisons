package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_87 {
    private final Production58_87 production = new Production58_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}