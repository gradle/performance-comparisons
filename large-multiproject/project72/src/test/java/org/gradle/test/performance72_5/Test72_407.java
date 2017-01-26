package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_407 {
    private final Production72_407 production = new Production72_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}