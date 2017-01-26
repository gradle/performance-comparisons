package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_131 {
    private final Production72_131 production = new Production72_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}