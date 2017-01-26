package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_362 {
    private final Production40_362 production = new Production40_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}