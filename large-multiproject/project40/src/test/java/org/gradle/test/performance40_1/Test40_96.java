package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_96 {
    private final Production40_96 production = new Production40_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}