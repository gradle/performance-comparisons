package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_276 {
    private final Production72_276 production = new Production72_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}