package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_407 {
    private final Production60_407 production = new Production60_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}