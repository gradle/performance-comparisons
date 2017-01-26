package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_388 {
    private final Production40_388 production = new Production40_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}