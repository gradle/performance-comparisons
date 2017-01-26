package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_138 {
    private final Production58_138 production = new Production58_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}