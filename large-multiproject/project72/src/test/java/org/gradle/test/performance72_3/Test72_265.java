package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_265 {
    private final Production72_265 production = new Production72_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}