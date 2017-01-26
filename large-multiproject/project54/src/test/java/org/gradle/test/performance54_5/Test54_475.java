package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_475 {
    private final Production54_475 production = new Production54_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}