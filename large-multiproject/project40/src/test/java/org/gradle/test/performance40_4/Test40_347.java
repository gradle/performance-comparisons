package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_347 {
    private final Production40_347 production = new Production40_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}