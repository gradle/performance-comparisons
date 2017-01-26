package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_107 {
    private final Production40_107 production = new Production40_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}