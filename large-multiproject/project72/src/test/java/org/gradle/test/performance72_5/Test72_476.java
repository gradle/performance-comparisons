package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_476 {
    private final Production72_476 production = new Production72_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}