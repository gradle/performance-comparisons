package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_249 {
    private final Production72_249 production = new Production72_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}