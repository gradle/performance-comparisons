package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_166 {
    private final Production40_166 production = new Production40_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}