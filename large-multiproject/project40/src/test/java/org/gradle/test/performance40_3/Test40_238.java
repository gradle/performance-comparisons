package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_238 {
    private final Production40_238 production = new Production40_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}