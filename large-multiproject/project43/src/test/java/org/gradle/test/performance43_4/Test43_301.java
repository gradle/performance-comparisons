package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_301 {
    private final Production43_301 production = new Production43_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}