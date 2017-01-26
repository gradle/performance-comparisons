package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_45 {
    private final Production54_45 production = new Production54_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}