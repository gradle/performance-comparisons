package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_283 {
    private final Production72_283 production = new Production72_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}