package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_255 {
    private final Production54_255 production = new Production54_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}