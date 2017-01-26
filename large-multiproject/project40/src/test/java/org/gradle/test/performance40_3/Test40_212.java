package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_212 {
    private final Production40_212 production = new Production40_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}