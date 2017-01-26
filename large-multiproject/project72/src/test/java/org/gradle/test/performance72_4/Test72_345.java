package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_345 {
    private final Production72_345 production = new Production72_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}