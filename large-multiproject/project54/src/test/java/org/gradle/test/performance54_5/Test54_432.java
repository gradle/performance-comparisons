package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_432 {
    private final Production54_432 production = new Production54_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}