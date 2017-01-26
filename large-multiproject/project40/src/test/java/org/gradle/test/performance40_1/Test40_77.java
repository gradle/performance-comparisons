package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_77 {
    private final Production40_77 production = new Production40_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}