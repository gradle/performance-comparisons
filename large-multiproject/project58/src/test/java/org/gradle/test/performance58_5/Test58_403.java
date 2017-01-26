package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_403 {
    private final Production58_403 production = new Production58_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}