package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_476 {
    private final Production58_476 production = new Production58_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}