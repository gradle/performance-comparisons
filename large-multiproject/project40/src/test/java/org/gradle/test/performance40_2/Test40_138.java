package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_138 {
    private final Production40_138 production = new Production40_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}