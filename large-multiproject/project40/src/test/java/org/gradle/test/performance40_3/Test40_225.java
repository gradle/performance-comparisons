package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_225 {
    private final Production40_225 production = new Production40_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}