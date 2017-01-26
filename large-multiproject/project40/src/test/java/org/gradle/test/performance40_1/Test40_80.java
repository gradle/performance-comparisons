package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_80 {
    private final Production40_80 production = new Production40_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}