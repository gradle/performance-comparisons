package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_209 {
    private final Production54_209 production = new Production54_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}