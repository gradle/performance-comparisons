package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_253 {
    private final Production54_253 production = new Production54_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}