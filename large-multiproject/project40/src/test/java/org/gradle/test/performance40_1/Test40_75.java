package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_75 {
    private final Production40_75 production = new Production40_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}