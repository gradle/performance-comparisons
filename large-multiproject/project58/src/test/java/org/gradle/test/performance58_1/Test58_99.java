package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_99 {
    private final Production58_99 production = new Production58_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}