package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_282 {
    private final Production40_282 production = new Production40_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}