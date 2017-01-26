package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_225 {
    private final Production54_225 production = new Production54_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}