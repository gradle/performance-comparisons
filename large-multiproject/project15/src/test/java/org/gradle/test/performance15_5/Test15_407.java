package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_407 {
    private final Production15_407 production = new Production15_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}