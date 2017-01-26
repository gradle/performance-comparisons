package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_334 {
    private final Production72_334 production = new Production72_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}