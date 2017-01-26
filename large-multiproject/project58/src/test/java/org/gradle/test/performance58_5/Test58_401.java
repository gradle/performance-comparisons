package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_401 {
    private final Production58_401 production = new Production58_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}