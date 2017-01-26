package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_431 {
    private final Production58_431 production = new Production58_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}