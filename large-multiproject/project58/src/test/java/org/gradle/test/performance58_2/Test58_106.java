package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_106 {
    private final Production58_106 production = new Production58_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}