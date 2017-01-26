package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_288 {
    private final Production40_288 production = new Production40_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}