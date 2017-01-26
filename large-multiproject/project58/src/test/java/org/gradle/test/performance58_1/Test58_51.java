package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_51 {
    private final Production58_51 production = new Production58_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}