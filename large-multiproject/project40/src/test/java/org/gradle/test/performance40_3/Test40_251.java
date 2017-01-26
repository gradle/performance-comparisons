package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_251 {
    private final Production40_251 production = new Production40_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}