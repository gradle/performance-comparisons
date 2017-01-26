package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_172 {
    private final Production40_172 production = new Production40_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}