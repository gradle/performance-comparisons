package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_123 {
    private final Production11_123 production = new Production11_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}