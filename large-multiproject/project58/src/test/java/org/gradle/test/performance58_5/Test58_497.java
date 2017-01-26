package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_497 {
    private final Production58_497 production = new Production58_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}