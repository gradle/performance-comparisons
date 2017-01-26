package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_168 {
    private final Production40_168 production = new Production40_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}