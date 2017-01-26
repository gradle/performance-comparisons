package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_97 {
    private final Production54_97 production = new Production54_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}