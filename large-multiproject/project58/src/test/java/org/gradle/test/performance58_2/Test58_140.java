package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_140 {
    private final Production58_140 production = new Production58_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}