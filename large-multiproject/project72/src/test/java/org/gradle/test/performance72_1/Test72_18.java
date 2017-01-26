package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_18 {
    private final Production72_18 production = new Production72_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}