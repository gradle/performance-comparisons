package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_81 {
    private final Production72_81 production = new Production72_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}