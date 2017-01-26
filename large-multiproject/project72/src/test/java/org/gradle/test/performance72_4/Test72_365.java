package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_365 {
    private final Production72_365 production = new Production72_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}