package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_341 {
    private final Production72_341 production = new Production72_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}