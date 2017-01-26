package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_89 {
    private final Production40_89 production = new Production40_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}