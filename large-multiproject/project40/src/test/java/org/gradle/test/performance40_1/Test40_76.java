package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_76 {
    private final Production40_76 production = new Production40_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}