package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_157 {
    private final Production40_157 production = new Production40_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}