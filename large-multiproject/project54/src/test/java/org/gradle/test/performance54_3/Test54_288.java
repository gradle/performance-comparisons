package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_288 {
    private final Production54_288 production = new Production54_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}