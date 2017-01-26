package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_68 {
    private final Production40_68 production = new Production40_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}