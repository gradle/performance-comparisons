package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_444 {
    private final Production40_444 production = new Production40_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}