package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_272 {
    private final Production72_272 production = new Production72_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}