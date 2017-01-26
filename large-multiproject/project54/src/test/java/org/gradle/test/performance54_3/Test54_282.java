package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_282 {
    private final Production54_282 production = new Production54_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}