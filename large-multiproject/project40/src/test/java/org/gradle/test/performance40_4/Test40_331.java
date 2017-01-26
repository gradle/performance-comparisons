package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_331 {
    private final Production40_331 production = new Production40_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}