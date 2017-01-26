package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_26 {
    private final Production58_26 production = new Production58_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}