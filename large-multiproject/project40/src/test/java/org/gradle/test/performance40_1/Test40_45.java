package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_45 {
    private final Production40_45 production = new Production40_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}