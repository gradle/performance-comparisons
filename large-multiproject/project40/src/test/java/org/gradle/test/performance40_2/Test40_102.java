package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_102 {
    private final Production40_102 production = new Production40_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}