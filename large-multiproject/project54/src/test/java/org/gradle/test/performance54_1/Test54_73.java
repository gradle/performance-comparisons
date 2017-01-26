package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_73 {
    private final Production54_73 production = new Production54_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}