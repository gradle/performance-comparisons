package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_58 {
    private final Production40_58 production = new Production40_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}