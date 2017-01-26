package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_321 {
    private final Production72_321 production = new Production72_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}