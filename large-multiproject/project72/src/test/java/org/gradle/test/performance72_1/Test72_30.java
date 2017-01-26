package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_30 {
    private final Production72_30 production = new Production72_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}