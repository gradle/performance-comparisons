package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_28 {
    private final Production58_28 production = new Production58_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}