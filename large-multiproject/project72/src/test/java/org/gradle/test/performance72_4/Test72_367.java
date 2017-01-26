package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_367 {
    private final Production72_367 production = new Production72_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}