package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_365 {
    private final Production58_365 production = new Production58_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}