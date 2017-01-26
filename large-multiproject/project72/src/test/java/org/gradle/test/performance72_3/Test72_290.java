package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_290 {
    private final Production72_290 production = new Production72_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}