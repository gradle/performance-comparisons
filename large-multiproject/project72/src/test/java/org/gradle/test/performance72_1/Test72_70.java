package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_70 {
    private final Production72_70 production = new Production72_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}