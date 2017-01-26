package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_331 {
    private final Production54_331 production = new Production54_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}