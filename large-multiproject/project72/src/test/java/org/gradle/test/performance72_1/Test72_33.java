package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_33 {
    private final Production72_33 production = new Production72_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}