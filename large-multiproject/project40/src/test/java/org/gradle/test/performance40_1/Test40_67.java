package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_67 {
    private final Production40_67 production = new Production40_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}