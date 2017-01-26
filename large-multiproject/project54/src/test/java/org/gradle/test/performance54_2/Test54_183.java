package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_183 {
    private final Production54_183 production = new Production54_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}