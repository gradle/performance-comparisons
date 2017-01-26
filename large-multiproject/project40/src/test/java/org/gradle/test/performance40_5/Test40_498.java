package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_498 {
    private final Production40_498 production = new Production40_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}