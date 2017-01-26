package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_12 {
    private final Production72_12 production = new Production72_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}