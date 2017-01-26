package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_195 {
    private final Production40_195 production = new Production40_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}