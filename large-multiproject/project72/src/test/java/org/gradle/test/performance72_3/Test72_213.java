package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_213 {
    private final Production72_213 production = new Production72_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}