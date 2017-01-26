package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_62 {
    private final Production40_62 production = new Production40_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}