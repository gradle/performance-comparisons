package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_115 {
    private final Production72_115 production = new Production72_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}