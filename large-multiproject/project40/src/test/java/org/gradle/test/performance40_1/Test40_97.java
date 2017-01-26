package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_97 {
    private final Production40_97 production = new Production40_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}