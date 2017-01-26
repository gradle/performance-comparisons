package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_207 {
    private final Production54_207 production = new Production54_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}