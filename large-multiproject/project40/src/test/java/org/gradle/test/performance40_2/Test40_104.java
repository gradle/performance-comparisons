package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_104 {
    private final Production40_104 production = new Production40_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}