package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_310 {
    private final Production58_310 production = new Production58_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}