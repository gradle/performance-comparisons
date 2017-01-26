package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_407 {
    private final Production30_407 production = new Production30_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}