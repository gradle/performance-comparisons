package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_46 {
    private final Production58_46 production = new Production58_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}