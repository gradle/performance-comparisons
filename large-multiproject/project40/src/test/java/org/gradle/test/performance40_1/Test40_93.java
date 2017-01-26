package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_93 {
    private final Production40_93 production = new Production40_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}