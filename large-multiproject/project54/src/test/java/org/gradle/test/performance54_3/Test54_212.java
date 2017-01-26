package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_212 {
    private final Production54_212 production = new Production54_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}