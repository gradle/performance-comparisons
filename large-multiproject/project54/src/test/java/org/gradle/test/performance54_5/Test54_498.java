package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_498 {
    private final Production54_498 production = new Production54_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}