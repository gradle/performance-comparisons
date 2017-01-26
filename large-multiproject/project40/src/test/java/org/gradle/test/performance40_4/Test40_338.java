package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_338 {
    private final Production40_338 production = new Production40_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}