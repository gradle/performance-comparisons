package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_41 {
    private final Production40_41 production = new Production40_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}