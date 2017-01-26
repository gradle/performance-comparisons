package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_354 {
    private final Production72_354 production = new Production72_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}