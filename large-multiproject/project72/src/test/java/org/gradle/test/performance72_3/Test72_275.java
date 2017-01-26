package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_275 {
    private final Production72_275 production = new Production72_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}