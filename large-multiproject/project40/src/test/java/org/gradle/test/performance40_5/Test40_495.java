package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_495 {
    private final Production40_495 production = new Production40_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}