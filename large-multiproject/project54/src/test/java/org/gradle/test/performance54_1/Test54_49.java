package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_49 {
    private final Production54_49 production = new Production54_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}