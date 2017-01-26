package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_209 {
    private final Production40_209 production = new Production40_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}