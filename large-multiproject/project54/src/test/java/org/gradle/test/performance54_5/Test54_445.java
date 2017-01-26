package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_445 {
    private final Production54_445 production = new Production54_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}