package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_31 {
    private final Production72_31 production = new Production72_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}