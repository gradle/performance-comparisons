package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_49 {
    private final Production40_49 production = new Production40_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}