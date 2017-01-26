package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_34 {
    private final Production58_34 production = new Production58_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}