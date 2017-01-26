package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_271 {
    private final Production72_271 production = new Production72_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}