package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_78 {
    private final Production40_78 production = new Production40_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}