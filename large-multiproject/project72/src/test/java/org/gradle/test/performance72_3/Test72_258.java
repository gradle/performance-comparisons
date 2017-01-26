package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_258 {
    private final Production72_258 production = new Production72_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}