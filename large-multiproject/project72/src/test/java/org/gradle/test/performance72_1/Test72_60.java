package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_60 {
    private final Production72_60 production = new Production72_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}