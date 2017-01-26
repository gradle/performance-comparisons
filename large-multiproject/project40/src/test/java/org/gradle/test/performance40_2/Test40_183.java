package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_183 {
    private final Production40_183 production = new Production40_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}