package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_171 {
    private final Production58_171 production = new Production58_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}