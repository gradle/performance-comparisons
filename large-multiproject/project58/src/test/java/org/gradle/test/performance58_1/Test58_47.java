package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_47 {
    private final Production58_47 production = new Production58_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}