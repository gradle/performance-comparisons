package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_77 {
    private final Production54_77 production = new Production54_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}