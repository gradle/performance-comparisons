package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_210 {
    private final Production58_210 production = new Production58_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}