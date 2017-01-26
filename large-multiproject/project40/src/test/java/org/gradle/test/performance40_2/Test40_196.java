package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_196 {
    private final Production40_196 production = new Production40_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}